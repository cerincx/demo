package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("demo")
public class Democonfig {

	private List<Archive> archive = new ArrayList<>();
	
	
	public Democonfig(List<Archive> archive) {
		System.out.println("constri=uu");
		this.archive = archive;
	}

	public List<Archive> getArchive() {
		return archive;
	}


	public void setArchive(List<Archive> archive) {
		this.archive = archive;
	}

	@Override
	public String toString() {
		return "Democonfig [archive=" + archive + "]";
	}


	public static class Archive {
		private String host;
		private String database;
		private String port;
		
		public Archive(String host, String database, String port) {
			System.out.println("constri=uu Archive");
			this.host = host;
			this.database = database;
			this.port = port;
		}
		public String getHost() {
			return host;
		}
		public void setHost(String host) {
			this.host = host;
		}
		public String getDatabase() {
			return database;
		}
		public void setDatabase(String database) {
			this.database = database;
		}
		public String getPort() {
			return port;
		}
		public void setPort(String port) {
			this.port = port;
		}
		@Override
		public String toString() {
			return "Archive [host=" + host + ", database=" + database + ", port=" + port + "]";
		}
		
	}
}
