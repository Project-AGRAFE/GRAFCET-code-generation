package org.eclipse.acceleo.plc.generator.main;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.acceleo.plc.generator.main.Generate;
import org.eclipse.acceleo.plc.generator.Activator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class RunGenerator implements IObjectActionDelegate {

	protected List<IFile> files;
	
	@Override
	public void run(IAction action) {
		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				try {
					Iterator<IFile> filesIt = files.iterator();
					while (filesIt.hasNext()){
						IFile model = (IFile)filesIt.next();
						URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
						IContainer target = model.getProject().getFolder("Generierter Code");
						
						try {
							Generate gen = new Generate(modelURI, target.getLocation().toFile(), getArguments());
							String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.eclipse.acceleoplc.generator", "org.eclipse.acceleo.plc.generator.main.Generate", modelURI.toString(), target.getFullPath().toString(), new ArrayList<String>());
							gen.setGenerationID(generationID);
							gen.doGenerate(BasicMonitor.toMonitor(monitor));
						} catch (IOException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
						} finally {
							model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
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
	
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}
	
}