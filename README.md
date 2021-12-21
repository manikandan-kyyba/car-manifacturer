All are User Task

OEM Work flow

isOEM: true | false

If isOEM:
Add = Mask | Spray | Demask
Else:
Remove = Mask | Spray | Demask

{
	isOEM: true | false,
	step: "Step1 | Step2"
}

https://docs.camunda.org/manual/7.14/reference/rest/

https://github.com/TEJAPS/Camunda_SpringBoot
- Creating a new process
- Getting a REST client
- Deploying a process to the engine
- Starting your process via REST
- Finding and Completing a task

http://localhost:8080/h2-console

https://docs.camunda.org/manual/7.7/reference/rest/

https://camunda.com/blog/2015/08/start-and-complete-process-with-rest-api/

https://docs.camunda.org/manual/latest/reference/rest/task/post-complete/#example

https://camunda.com/blog/2021/10/start-and-step-through-a-process-with-rest-feat-swaggerui/

https://camunda.com/blog/2021/03/external-task-client-spring-bootified/

{
"variables": {
"isOEM": {
"value": true,
"type": "boolean"
},
"step": {
"value": "Step 1"
}
}
}