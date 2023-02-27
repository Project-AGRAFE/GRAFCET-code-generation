package org.eclipse.emf.grafcet2plccode.popup.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import org.eclipse.acceleo.grafcet.generator.main.GenerateName;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
//import org.eclipse.gmf.grafcet.actions.Activator;
//import org.eclipse.gmf.grafcet.actions.commands.VerifyGrafcet;
//import org.eclipse.gmf.grafcet.actions.popup.actions.IActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;


import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.hsu.grafcet.Grafcet;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.grafcet2plccode.Activator;
import org.eclipse.emf.grafcet2plccode.commands.generatePlcModel;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

public class runGeneratePlcModel implements IObjectActionDelegate {

	private Shell shell;
	protected List<IFile> files;	
	private Grafcet selectedDoc;
	/**
	 * Constructor for Action1.
	 */
	public runGeneratePlcModel() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
				
		/*
		MessageDialog.openInformation(
			shell,
			"Actions",
			"Generation was executed.");
		*/
		//System.out.println("Test1"+ files);
		if (files != null) {
			//System.out.println("Test2"+ files);
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				
				public void run(IProgressMonitor monitor) {
					try {
						//System.out.println("Test3"+ files);
						Iterator<IFile> filesIt = files.iterator();
						while (filesIt.hasNext()) {
							//System.out.println("Test4"+ files);
							IFile model = (IFile)filesIt.next();
							//GenerateName name = GenerateName.getInstance();
							//name.setFileName(model.getName());
							URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
							try {
								//System.out.println("Test5");
								IContainer target = model.getProject().getFolder("PlcModels");
								//System.out.println("Test6");
								generatePlcModel generator = new generatePlcModel(modelURI, target, getArguments(), model);
								//System.out.println("Test7");
								generator.rungeneration();
								//System.out.println("Test8");
							
							} finally {
								model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
							//	System.out.println("Test9");
							}
						}
					} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			};
			try {
				PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
			} catch (InvocationTargetException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			} catch (InterruptedException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
		System.out.println("\n\nPLC-Model is generated!!!");
		
	}

	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}
	
	public boolean isEnabled() {
		return selectedDoc != null;
	}
	
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}


}
