package com.sachin.java8;

public class Songs {

	private String title;
	private double length;
	private String genere;
	private String artist;
	
	
	public Songs(String title, double length, String genere, String artist) {
		super();
		this.title = title;
		this.length = length;
		this.genere = genere;
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return "Songs [title=" + title + ", length=" + length + ", genere=" + genere + ", artist=" + artist + "]";
	}

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;*/
		return title.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Songs other = (Songs) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;*/
		Songs other = (Songs)obj;
		if(title.equals(other.title))
			return true;
		else
			return false;
	}	
}
