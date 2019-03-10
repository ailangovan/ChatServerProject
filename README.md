# ChatServerProject

# team-212-F18 project
This is a client-server messaging application.
Prattle :: Server side of the messaging application.
Chatter :: Client side of the messaging application.

Our focus is on the development of the server side of this messaging application and expand features to be able to fully support a rich messaging experience.


## TEAM MEMBERS
* Aswath Ilangovan
* Sourabh Punja
* Rakesh Krishna Radhakrishnan
* Shweta Oak


## Sample Message Formats Implemented
Message formats for different messages implemented in sprint 3. 

    1. Recall Messaging format :: /recall receiver <ReceiverName> text <Text>
        - eg: /recall receiver punja text  @punja hellowww
    
    2. Search Message format :: 
        1.  /search sender <SenderName> fromTime <FromTimeStamp> toTime <ToTimeStamp>
            - eg: /search sender rak fromTime 2018-11-26,09:55:10 toTime 2018-11-26,09:55:10
        2. /search receiver <ReceiverName> fromTime <FromTimeStamp> toTime <ToTimeStamp>
            - eg: /search receiver punja FromTime 2018-12-01,22:25:16 toTime 2018-12-01,22:27:04
    
    3. Admin Messages :: To create,remove the subpoena(wiretap) between users/group there are four messages
        1. createSubpoenaUsers :: create Subpoena between two users
            - The message text is of format :: createSubpoenaUsers <FromUser> <ToUser> <SubpoenaUser>
        2. createSubpoenaGroup :: create Subpoena for group
            - The message text is of format :: createSubpoenaGroup <GroupName> <SubpoenaUser>
        3. removeSubpoenaUsers :: remove Subpoena between two users
            - The message text is of format :: removeSubpoenaUsers <FromUser> <ToUser> <SubpoenaUser>
        4. removeSubpoenaGroup :: remove Subpoena for group
            - The message text is of format :: removeSubpoenaGroup <FromUser> <ToUser> <SubpoenaUser>
        5. logger :: Switching logging on/off
            - The message text is of format :: logger <On/OFF>
        
