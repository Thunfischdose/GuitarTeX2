Installation:
0. Install java runtime environment (jre>1.8)
1. Install visual studio code
2. Install a tex destribution (tested wih texlive)
3. Install vscode extension for: latex support (tested with LaTeX Workshop)
(optional if you want to add features for: Java (tested with Language support for Java(TM) by Red Hat)
4. Clone the repo and open it with vscode

Usage:
1. Create a .gtx in the gtx/ folder
2. Ctrl+B-> Parse GTX: Handles the file over to the main.class which wraps the original parser (see /.vscode/tasks.json) and opens the parsed texfile which is stored in the tex/ 
folder
3. Right click build (using latex-workshop) -> pdf is actually stored is by default stored in the same (tex) folder
4. right click show pdf in new tab/webbrowser enables synctex debugging

