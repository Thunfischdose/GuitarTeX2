# GuitarTeX2 DevelopersEdition: Make your own guitar songbook
I always wanted to have a songbook where you dont have to turn pages during one song. With GuitarTeX2 I could easily achieve this even for songs where the tabs are 10 pages or 
longer when printed from other programs.
If you like the idea of writing your own compact songbook, GuitarTeX is the perfect tool for you. 

##Installation:
* Install java runtime environment (jre>1.8)
* Install visual studio code
* Install a tex destribution (tested wih texlive)
* Install vscode extension for: latex support (tested with LaTeX Workshop)
* optional. If you want to add features you need the Java SDK and I recommed the VSCode extension: Language support for Java(TM) by Red Hat)
* Clone the repo and open it with vscode

##Usage:
* Create a .gtx in the gtx/ folder
* Ctrl+B -> Parse GTX: Handles the file over to the main.class which wraps the original parser (see /.vscode/tasks.json)
* Ctrl+Shift+P -> run Tasks -> openTeX: Oopens the parsed texfile which is stored in the tex/ folder
* Right click build (using latex-workshop) -> pdf is actually stored is by default stored in the same (tex) folder
* right click show pdf in new tab/webbrowser enables synctex debugging

