## Project layout

This project uses the Maven Multi Module system to build the various modules. There is the main module, the palette,
which depends on the secondary module 'processing', to do the code generation based on our `palette.json`.
The multi module system is used as it is the easiest way to get our processing module to build at the same time, and then get used
by, the palette module. This also has the benefit of allowing us to publish the processing module independently.

The `palette.json` is vendored for simplicity, and must be manually updated if/when it changes.

