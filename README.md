# P2 Releng support utilities

This project aims to provide some IDE utilities for Eclipse for automation on release
engineering of Eclipse P2 builds.

## P2 Target platform validation

Target platform creation is a time consuming job in Eclipse. Once a target platform operates, is should be 
easily updateable. 

The bitub.support.p2.editor utilizes a selfmade EMF ecore P2 model which can read and write a target platform 
specification. An additional context menu entry validates selected installable units or the whole platform against 
current P2 meta content of the given update sites. The process will verify or upgrade unit versions.

