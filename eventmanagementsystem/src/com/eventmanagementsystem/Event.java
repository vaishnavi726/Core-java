package com.eventmanagementsystem;

public class Event extends EventManagement {
	
	 private String description;
	 private String startTime;
	 private String endTime;
	 private boolean started;
	 
	 public Event(Long id , String name, String des) {
		 this.id = id;
		 this.name = name;
		 this.description=des;
	 }
	 public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public boolean isStarted() {
			return started;
		}

		public void setStarted(boolean started) {
			this.started = started;
		}


}
