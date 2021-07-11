# REST-API

An API, or application programming interface, is a set of rules that define how applications or devices can connect to and communicate with each other. 

The code is written using the spring framework.
The server is created using the apache TOMCAT.

Java classes are created for the controller to work and annotations are used.
The request mapping is done in the file HotelController.java and all the different fields are added in com.example.demo.controller.

To run the API in local machine, open the Code in eclipse, start the Tomcat server and run the code as a springboot app.
Once the program is running, open postman and provide the API link in URL.
Select GET for get request.



For POST request, select POST from dropdown, enter URL and below body. Make sure to select body type as JSON.
{   
    "hotel_name" : "Wedgewood",
	"checkin" : "June 25,2021",
	"checkout" : "June 26,2021",
	"guests_list" : [
			{
				"firstName": "Matt",
				"lastName" : "Henry"
			},
			{
				"firstName": "Mary",
				"lastName" : "Henry"
			},
			{
				"firstName": "John",
				"lastName" : "Henry"
			}
		]
}

To test the deployed API, just provide below URL for GET and POST . Follow the same process as above.

GET: http://hotelreservationapp-env.eba-rhqz8wc6.us-east-1.elasticbeanstalk.com/hotelsList
POST: http://hotelreservationapp-env.eba-rhqz8wc6.us-east-1.elasticbeanstalk.com/reservation



