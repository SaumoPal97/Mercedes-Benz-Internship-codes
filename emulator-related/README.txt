This is directly inspired from the butterfly project (http://paradoxxxzero.github.io/2014/02/28/butterfly.html). So for the butterfly version, you can directly install using pip - "pip install butterfly".

However during the internship period, I have modified the file to a more simpler version. For running this, first you have to install the following - 
1. Python packages - Install using pip
	tornado>=3.2
2. Javascript - Install using npm
	coffeelint>=1.15.7
	grunt>=1.0.1
	grunt-coffeelint>=0.0.15
	grunt-contrib-coffee>=1.0.0
	grunt-contrib-cssmin>=1.0.1
	grunt-contrib-uglify>=1.0.1
	grunt-contrib-watch>=1.0.0
	grunt-sass>=^2.1.0
	google-caja>=*

After this, you have to copy the emulator folder in your desired directory and from that directory, run - "python emulator.server.py".
This will start a new session in your browser. Now for real-time logging, first you need to do the following steps on the target device-
1. copy the file screen-share.sh to the root directory of the target device
2. run "chmod a+x screen-share.sh"
3. run "chmod 777 screen-share.sh"
4. run "sudo cp /path_to_script/screen-share.sh /etc/init.d/"
5. run "sudo update-rc.d screen-share.sh defaults"
Now everytime the system is booted, a new screen session is started. Once this is done, you can start the browser emulator, then ssh into the target device from the emulated terminal, enter the following command - "screen -x test". This will enable real-time logging.

