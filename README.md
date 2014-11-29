Coffee Asset-Pipeline
===========================
The Coffee Asset-Pipeline module provides coffeescript compilation support for the jvm based asset-pipeline. Simply add this file to your buildscript classpath or development environment and they are automatically processed.

For more information on how to use asset-pipeline, visit [here](http://www.github.com/bertramdev/asset-pipeline).

Usage
-----

Simply create files in your standard `assets/javascripts` folder with extension `.coffee` or `.js.coffee`. You also may require other files by using the following requires syntax at the top of each file:

```coffee
#= require test
#= require_self
#= require_tree .
```

*NOTE:* If the command line node coffee command is detected on your system. The application will attempt to use node to compile your javascript instead.
