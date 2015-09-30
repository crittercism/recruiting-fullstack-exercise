REST API Exercise
-----------------

General
-------
The purpose of this exercise is to modify the API server component to do the following things:

# Return a single crash (in JSON) given its id.
# Build out the AppController to do the following:
## Return a single app (in JSON) given its id.
## Authenticate the user and refuse to return the app information if the user does not have rights to see it.
## Return all of the crashes that belong to a specified app

Data
----
There is a data directory that contains JSON versions of the various entities you will need: user, account, app, crash. 

Platform
--------
There are partial implementations of the API server. One in Java, one in Python and one in Node.js. You may choose whichever platform you are most comfortable with.
