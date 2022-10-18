CS3733 Software Engineering Final Project in Collaboration with Brigham and Womens Hospital

This project is the culmination of your Software Engineering course. In this project our goal was to create a Java app that would be used by the Brigham and Womens Hospital employees and would complete various tasks. One of the main aspects of this project was creating a graphical map editor that would be used to display various service requests (Lab service request, Meal service requests, etc.) and their locations on the map. In addition to these requests it would display all of the equipment in the hospital and their locations. Along with this map editor there would be a dashboard that would display display most of the data that showed up on the map that would be easy to understand for the employees. Seperate from the map editor there were many service requests that would be useful to the employees for whatever they needed. If they needed a meal for their patient they could request it and it would be written to the Apache Derby database to be completed.


My contributions in this project were mulitple. My main contribution was the dashboard for the graphical map editor were I took data from our database that was written to the map editor and translated it into charts and graphs that would display relavent information in a way that anyone could understand. Below is an image of the final dashboard.


![image](https://user-images.githubusercontent.com/101892274/196527865-5b5671fc-c7cf-445a-a1ea-6f9a6f35e00d.png)

To give a quick description of the above image, the charts to the left depict the total amount of clean, dirty, and inuse (green, red, and yellow respectively) equipment on each floor of the hospital. Simply by clicking on one of the floors in the chart you can get more detailed information to the right. 


![1](https://user-images.githubusercontent.com/101892274/196528872-60ee978f-a4e0-4e7a-8304-dcafbc21a5fe.JPG)

On the bottom right , in the nested bar charts, you can see each individual equipment type along with its total amount on each floor, nested inside is the status of the pieces of equipment again being either clean, dirty, or inuse. At a glance you can understand the ratios of the status of equipment types, but if youd like to know exact numbers its just a click away; as clicking on any of the individual bars in the chart will display its exact value. This can be seen in the infoblock floating above whichever element of the nested bar charts that was selected (in this case there are 28 total infusion pumps with 18 being clean).


![2](https://user-images.githubusercontent.com/101892274/196529155-1d8dc4c2-6bd3-432a-a974-f4c33f4a595a.JPG)

On the top right, there is one more level of detail in this dashboard presented by the table in the top right. By clicking on any of the individual bars in the chart of the levels of the hospital, displayed in the table is each individual piece of equipment in that status category on that floor (clean, dirty, inuse). As can be seen in the above image these pieces of equipment belong to the third floor and are clean. This table gives a detailed view of each equipment unit, displaying its EquipmentID, EquipmentType, Avaliability, and its CurrentLocation. This can be very useful if you need to perform an action on, or just need to know the location of any individual equipment unit.


![3](https://user-images.githubusercontent.com/101892274/196531895-3c696702-d576-4299-a786-164758291237.JPG)

(Location Table)

![4](https://user-images.githubusercontent.com/101892274/196531939-aa4ae68b-2ebe-432b-b6d9-2daa8740a155.JPG)

(Equipment Table)

Furthermore, there are 3 buttons at the bottom of the chart of the levels of the hospital these display the location table, which shows every location in the hospital, and the equipment table, which displays every piece of equipment in the hospital; these work as popups overlayed ontop of the dashboard. Both of which are aided by a search bar that can filter by any attribute they may hold.


![5](https://user-images.githubusercontent.com/101892274/196533730-458647b2-3be9-4cea-ae47-e3d96b1faa4e.JPG)

Finally there exists the alerts button next to the table buttons. The purpose of this is to display important alerts, in real time, or to see past alerts that havent yet been addressed. As an example, if someone in the client database were to alter the status of infusion pumps to make more than 10 dirty on a given floor, an alert would pop up in the dashboard (using the observer pattern) telling the employee that all 10 pumps have automatically be registered to be cleaned. Above you can see an empty chart as there are currently no outstanding alerts.
