Full Stack REST API and UI Exercise
-----------------------------------

General
-------
Examine the files in the [/api-server/data](/api-server/data) directory. You will see 4 different entities, all of which are related (accounts, apps, crashes and users). These data files are simplified versions of the major entities found in the Crittercism system. The relationship between entities is shown below in a UML static class diagram.

![Alt text](/static_class_diagram.png "Entity Relationship Static Class Diagram")

For this exercise, you will perform two major tasks:

* Create a REST service in node.js, Python or Java (the api server). The REST service must:
  * Return a single crash (in JSON) given its id.
  * Return a single app (in JSON) given its id.
  * Return all of the crashes that belong to a specific app.
  * Authenticate the user using Basic Auth on each request and refuse to return information if the user does not have rights to see it.
  * Include a script to start the service called `start-api-server.sh`.

* Create a simple web-based user interface (the ui server) in node.js, Python or Java. The user interface must call the REST web service created in part 1 above. The user interface must provide the following functionality:
  * A simple login page, published at `http://localhost:8080/login`.
  * A landing page that displays:
  * The authenticated user's name and account name.
  * The list of apps associated with the user's account.
    * Clicking on an app must display all of the names of the crashes that belong to that selected app.
      * Clickkng on a crash name must display the all of the information for the selected crash.

To submit your work, you must provide a single zip file that contains:
  * Full source code for the api server and ui server components.
  * A script called `start-api-server.sh` that starts the api server component.
  * A script called `start-ui-server.sh` that starts te UI server component.
  * If you choose a compiled language, you must provide a script, called `build.sh` that performs the necessary compilation steps.

