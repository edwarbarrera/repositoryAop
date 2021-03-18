package Dao;

public class LoginDaoImpl implements LoginDao {

	@Override
	public void daoCreation() {
		System.out.println(" ich bean daoCreationed");

	}

	@Override
	public void daoAcess() {
		System.out.println(" ich bean daoAcessed");

	}

	@Override
	public void methodMan() {
		System.out.println(" ich bean methoded");

	}

}
