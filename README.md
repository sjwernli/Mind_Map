# Mind_Map
Mindmap application created for the Spring 2024 ACM Hackathon at Lewis & Clark College with @nbAugusta. Application placed 3rd among competitors.

## Overview
Allows a user to create graphical mindmaps, organizing text in circular thought bubbles of various colors with the option to draw lines linking togther different text bubbles. Users also have the capability to move text bubbles while preserving attached line links, as well as delete text bubbles. 

## Usage
To run the application on VS Code, right-click on any of the files within the `src` folder and click "Run Java".

* To draw a circle/bubble containing text, users should click on the circular icon in the bottom left corner of the interface, and then click on the desired color's palette square. Next, users type the desired text in the command line/terminal and press enter, before clicking where they wish to center the text bubble on the interface's canvas.

* To draw a line connecting two bubbles, users should click the diagonal line icon directly above the circular icon and then select a color, before clicking on the two bubbles they wish to connect. 

* To delete a bubble, users should click the 'X' icon directly above the diagonal line icon, and then click the bubble they wish to delete (this will delete any attached lines as well).

* To move a text bubble, users should click the crossed circle directly above the 'X' in the bottom left corner, before clicking on the bubble they wish to move, and then clicking where they wish to move/center the bubble.

To save a mindmap, users can click "File" in the upper left corner.

## Files, Folders, Dependencies
* From VS Code:
The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies. For this application, the only dependency is stdlib.jar from https://introcs.cs.princeton.edu/java/stdlib/ 

Meanwhile, the compiled output files will be generated in the `bin` folder by default.
