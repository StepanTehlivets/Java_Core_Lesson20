package ua.academy.lgs;

import java.io.Serializable;

public class Book implements Serializable {
	@FirstAnnotation("It is very nice book")
	private String name;
	@FirstAnnotation
	private int yearOfPublication;
	private String genre;
	@FirstAnnotation("Oh, I love his books")
	private String author;

	public Book(String name, int yearOfPublication, String genre, String author) {
		super();
		this.name = name;
		this.yearOfPublication = yearOfPublication;
		this.genre = genre;
		this.author = author;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + yearOfPublication;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (yearOfPublication != other.yearOfPublication)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", yearOfPublication=" + yearOfPublication + ", genre=" + genre + ", author="
				+ author + "]";
	}

}
