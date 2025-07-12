# TCreate - Java Game Libary (V0.45)

<h2>Introduction</h2>
I have made this game libary that you can use to easily make games with java swing. You can view TCreate info by using: TCreate.displayInfomation();

<h2>Features</h2>
<ul>
  <li>Game Loop, </li>
  <li>Scenes, </li>
  <li>Diifferent Sprites, </li>
  <li>Smooth Camera, </li>
  <li>User Interface (UI), </li>
  <li>Dragging, </li>
  <li>Scaling, </li>
  <li>Easy-to-use AssetManager with images & sounds, </li>
  <li>Examples, and</li>
  <li>Action Listeners! </li>
</ul>

<h2>Examples</h2>
There are examples to help you learn this libary:
<ul>
  <li>Moving with WASD (movement),</li>
  <li>Basic use of UI elements (homeScreen), and</li>
  <li>Basic use of hovering and dragging (hoverDragging)</li>
</ul>

<h2>How to use</h2>
To use this, download the folder tCreate. Then drag it into your src folder (where you keep all your files). 

<h4>Imports</h4>

<ul>
  <li>tCreate.*</li>
  <li>tCreate.assetManager.*</li>
  <li>tCreate.scene.*</li>
  <li>tCreate.sprite.*</li>
  <li>tCreate.ui.*</li>
  <li>tCreate.examples.(example).*</li>
</ul>

<h4>Using examples</h4>

To use an example such as movement, put this import at the top of your page:
<i>import tCreate.examples.movement.*;</i>

In your main method put this line of code:
<i>MovementDemo.launch();</i>

<h2>Documentation</h2>

<h3><u>Other</u></h3>

<h4><i>TCreate.displayInfomation()</i></h4>
Displays current version and creator in the console

<h4><i>ScreenPanel</i></h4>
Extends <i>JPanel</i> and holds all the code for the gameLoop and drawing and updating all elements in the scene.

<h4><i>ScreenObject</i></h4>
This is a class which you extend to have an x, y variable and a few function: <i>update()</i>, <i>draw(Graphics2D graphics)</i>, <i>getWorldX()</i> and <i>getWorldY()</i>. By using the code, <i>ScreenObject.setUp()</i>, you can pass in a screenObject, x, y position into the brackets. There is also a<i>Double scale</i> variable which you can update and then use with some functions which gives you the scaled variable. A <i>BufferedImage image</i> variable is also created with a function <i>imageRender(Graphics2D g)</i> to use images.

<h3><u>TCreate</u></h3>

<h4><i>new TCreate(title, width, height)</i></h4>
Inside the brackets, put the title of the game and then add two whole numbers for the size. This will create a <i>JFrame</i> with the title and size you picked for it. 

<h4><i>TCreate.startGame()</i></h4>
Starts the game loop

<h4><i>TCreate.changeSceneTo(scene)</i></h4>
Changes the current scene to the one you have created yourself. To learn more about scenes, go to the section called <i>Scenes</i>.

<h4><i>TCreate.getCurrentGame()</i></h4>
Returns with the game which <i>extends JPanel</i>. Learn more about this in the section called <i>ScreenPanel</i> in the <i>Other</i> section.

<h4><i>TCreate.getCurrentScene()</i></h4>
Returns with the current scene. To learn more about scenes, go to the section called <i>Scenes</i>.

<h3><u>Camera</u></h3>

<h4><i>Camera.smoothed</i></h4>
True or False variable which decides if the camera should be smooth when moving.

<h4><i>Camera.smoothing_speed</i></h4>
Whole number which decides how fast the camera smoothing should be. 1 - INSTANT.

<h4><i>Camera.positionTo(x, y)</i></h4>
2 Whole numbers which snaps the camera to a positon.

<h4><i>Camera.moveTo(x, y)</i></h4>
2 Whole numbers which uses smoothing to guide the camera to the position you entered in.

<h4><i>Camera.getX()</i> or <i>Camera.getY()</i></h4>
Gets current x or y position of the camera.

<h4><i>Camera.getWorldX(x)</i> or <i>Camera.getWorldY(y)</i></h4>
Returns a number which tells you where an element should be placed on the screen as the camera moves;



