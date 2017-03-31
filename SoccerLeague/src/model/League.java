package model;

/*
 * This domain object represents a soccer league
 */
public class League {

	int year;
	String season;
	String title;

	public League(int year, String season, String title) {
		super();
		this.year = year;
		this.season = season;
		this.title = title;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the season
	 */
	public String getSeason() {
		return season;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return title;
	}

}
