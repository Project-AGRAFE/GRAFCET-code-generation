# GRAFCET-code-generation
Transformation generating PCL code (IEC 61131-3 Structured Text (ST)) from IEC 60848 GRAFCET instances.

# Installation
- The provided code is an Eclipse plug-in project and depends on the GRAFCET-editor provided [here](https://github.com/Project-AGRAFE/GRAFCET-editor).
- Set up the GRAFCET editor as explained [here](https://github.com/Project-AGRAFE/GRAFCET-editor).
- Import the projects from this repository into the same Eclipse workspace as the GRAFCET-editor.

# Run the code generation
- Run the editor by creating a new runtime using _Run Configurations --> Eclipse Application_.
- Create a .grafcet file or [import one] (https://github.com/Project-AGRAFE/GRAFCET-instances).
- The code generation is two-step: a model-to-model transformation followed by a model-to-text transformation: Right-klick the .grafcet file and choose _GRAFCET --> Generate PLC Model_ a folder containing ST-code-model will be created containing a .xmi file. Right-klick the .xmi file _--> Acceleo Model to Text --> Generate Structured Text_. Again a folder will be created containing an [PLCopenXML file](https://www.plcopen.org/technical-activities/xml-exchange) containing the generated ST code.

# Publications
@article{Julius19,
title = {A model-driven approach for transforming GRAFCET specification into PLC code including hierarchical structures},
journal = {IFAC-PapersOnLine},
volume = {52},
number = {13},
pages = {1767-1772},
year = {2019},
note = {9th IFAC Conference on Manufacturing Modelling, Management and Control MIM 2019},
issn = {2405-8963},
doi = {https://doi.org/10.1016/j.ifacol.2019.11.457},
author = {Robert Julius and Thomas Trenner and Joerg Neidig and Alexander Fay}
}

@ARTICLE{Mross22,
  author={Mross, Robin and Schnakenbeck, Aron and Völker, Marcus and Fay, Alexander and Kowalewski, Stefan},
  journal={IEEE Access}, 
  title={Transformation of GRAFCET Into GAL for Verification Purposes Based on a Detailed Meta-Model}, 
  year={2022},
  volume={10},
  number={},
  pages={125652-125665},
  doi={10.1109/ACCESS.2022.3225736}}
