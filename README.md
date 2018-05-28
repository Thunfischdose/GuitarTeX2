# GuitarTeX2 Developers Edition
I always wanted to have a songbook where you dont have to turn pages during one song.
With GuitarTeX2 I could easily achieve this - even for songs where the tabs are 10 pages or 
longer when printed from other programs.
If you like the idea of writing your own compact songbook, GuitarTeX is the perfect tool for you. 
The main differences to the repo from which this is forked are:
* Reduce the project to the essential parser -> easy to adapt to personal needs
* Own TeX Installation necessary -> Full control and further processing of the parsed texfiles
* VSCode necessary ->  To have a good, up-to-date editor for running the parser, TeX and debugging of an adapted parser 

## Installation:
* Install java runtime environment (jre>=8)
* Install visual studio code
* Install a tex destribution (tested wih texlive)
* Install vscode extension for: latex support (tested with LaTeX Workshop)
* (optional) If you want to add features you need the Java SDK and I recommed the VSCode extension: Language support for Java(TM) by Red Hat)
* Clone the repo and open it with vscode

## Usage:
* create a gtx folder or rename the example-gtx folder
* Create a .gtx file in the gtx/ folder for songs and .gtb files with include premitive for songbooks
* Ctrl+B -> Parse GTX: Handles the file over to the main.class which wraps the original parser (see /.vscode/tasks.json)
* Ctrl+Shift+P -> run Tasks -> openTeX: Opens the parsed texfile which is stored in the tex/ folder
* Right click build (using latex-workshop) -> pdf is actually stored is by default stored in the same (tex) folder
* right click show pdf in new tab/webbrowser enables synctex debugging

## Licensing
[GNU GPL-v2](https://opensource.org/licenses/GPL-2.0)

## Further information
This was tested under ArchLinux and Windows10 x64.

Big thanks to Nikolai providing his parser!

I will provide a short user and developer wiki the next days.

