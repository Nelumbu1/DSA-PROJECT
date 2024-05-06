Data Structures and Algorithms 2 (DSA711S)
Assignment Structure
DUE DATE: 26 April 2024 @ 23:59
Deliverables / Deadlines
 Please respect the deadlines.
 All submissions are done on eLearning (no hard copies, nor email submissions will 
be accepted).
NOTE: Only ONE(1) member (representative/Group Leader) from the group needs to upload the 
assignment/all members student numbers and names should be clearly marked on the submission.
Make sure you forward the list of all group members as it will not be added one (1) week before the 
assignment is due for submission and no addition of members at all after submission.
Instructions to Students 
a) The Assignment contributes 40% to your final semester mark.
b) Please feel free to contact your lecturer if you have any questions or problems regarding the 
assignment.
c) The assignment is to be completed in groups of 5 or 6 students (min/max).
d) Please indicate the [Student Number], [First Name], and [Last Name] of all Project Team members.
e) If students are found to have plagiarised, this is a crime, serious actions will be taken. (Please read 
through the Course Outline).
f) All assignments should be submitted via GitHub/GitLab repository and the link to your repo should be 
submitted/shared on elearning/MOODLE Learning Management System. Also, add your lecturer to your 
repository. If plagiarism is detected, marks will be deducted as follows
It is the student's responsibility to be familiar with and adhere to the NUST’s Policies. These Policies 
can be found in the NUST Prospectus or online.
Project Description 
Computer local area networks sometimes adopt a star topology. Star topology means each network 
node (computer, or other computing device) is connected to a central (server) node (central hub, 
router or switch) with a point-to-point connection. All nodes link to each other via the central (server) 
node. No direct connection exists between the peripheral (client) nodes. The central node is the server 
and serves all other nodes (clients). The peripheral nodes to the central node pass all traffic through 
the central node.
You decide to model the star topology using a data structure with a central node having multiple 
pointers/references on it and space for at least two (2) data values. The peripheral nodes only have 
one pointer/reference each and space for at least two (2) data values.
a. ServerNode Class
i. Write a java class (call it ServerNode) for the server node. [5 marks]
ii. The server node object must broker messages sent by client node objects. [10 marks]
b. ClientNode Class
i. Write a java class (call it ClientNode) for the client node. [2 marks]
ii. Each client node object must have a send( ) and receive( ) method, [6 marks]
iii. Each client node must have an ID/unique name [2 marks]
NOTE:
The send( ) method is naturally a wrapper around a call to an appropriate 
method on
the server node.
The receive( ) method need do nothing more than print the message and the 
name/id of
the sender. It need only be sequential.
e.g. client X sends "hello" to client Y who prints the message.
c. Star Class
i.
ii.
Write a java class (call it Star) for the model of the network. [10 marks]
The class must have the methods insertNode( ) and deleteNode( ). [10 marks]
NOTE:
insertNode(zero or more parameters): adds a node to the model,
deleteNode(zero or more parameters): deletes a node from the model.
d. Data compression 
i. If you were to compress the messages sent between clients, which compression 
algorithm(s) would be most suited for this purpose? Justify your answer. Compress 
and decompress any one of the messages sent between any two nodes.
ii. Compute the worst case time complexity of your solution in d(i).
 
[10 marks]
Notes 
Details missing from the assignment directions e.g. return types for the methods and so on, give
you the opportunity to be creative.
None of the above classes is the main class; the main class is separate from the classes
described above.
The examiner may award bonus marks for productive creativity.
The examiner expects copious amounts of comments in your code in order to be convinced 
that you understand what you are doing
