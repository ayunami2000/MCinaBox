#pragma once

#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

#include "Client.h"
#include "boat_server.h"
class Server{

public :
    struct boat* mBoat;
	void* current_window;
	void (*current_event_processor)(BoatInputEvent*);
	
public :
    Server();
public :
    static Server* mServer;

};

