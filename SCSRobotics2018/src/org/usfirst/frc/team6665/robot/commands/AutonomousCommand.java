
 System.err.println("autoInit ran");
        timer = new Timer();
        timer.start();
      side= 1; // 1 is Left, 2 is right
    gameData= DriverStation.getInstance().getGameSpecificMessage();
      //side= 1; // 1 is Left, 2 is right
   // gameData= DriverStation.getInstance().getGameSpecificMessage();
        // time = 0;
    }
     // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	
    	if(timer.get()<= 5) {
    	if(timer.get()<= 3) {
    	   System.err.println("autoEx ran");
        
           Robot.driveTrain.differentialDrive1.arcadeDrive(-0.6,0);//drive "forward"
        						// (speed/output from motor,rotation angle)
        } 
         else if(timer.get()<=5){
	    Robot.driveTrain.differentialDrive1.arcadeDrive(0,0.5);
	    }
	    
	    else if(timer.get()<=6){
	    Robot.driveTrain.differentialDrive1.arcadeDrive(-0.6,0);
	    }
	
	else if(timer.get()<=9){
	  Robot.driveTrain.differentialDrive1.arcadeDrive(0,0.5);
	
	}
    	else if(timer.get()<=10){
		Robot.driveTrain.differentialDrive1.arcadeDrive(-0.6,0);
    	
	} 
    	else if (timer.get()<=14){
	Robot.driveTrain.differentialDrive1.arcadeDrive(-0.6.0);
	
	}
        else if (timer.get()=15){
	Robot.driveTrain.differentialDrive1.arcadeDrive(0.0);
	
	}    }  //end v. execute
     
