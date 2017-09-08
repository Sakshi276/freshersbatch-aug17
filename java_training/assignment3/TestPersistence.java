abstract class Persistence
{
	abstract public void persist();
}

class FilePersistence extends Persistence
{
	public void persist()
	{
		System.out.println("FilePersistence class");
	}
}

class DatabasePersistence extends Persistence
{
	public void persist()
	{
		System.out.println("FilePersistence class");
	}
}

class PersistenceFactory
{
	public static FilePersistence getPersistent()
	{
		return new FilePersistence();
	}
}

class TestPersistence
{
	public static void main(String args[])
	{
		Persistence p=PersistenceFactory.getPersistent();
		p.persist();
	}
}