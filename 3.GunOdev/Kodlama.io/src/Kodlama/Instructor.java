package Kodlama;

public class Instructor extends User{
		
		String personelCode;
		String accountNumber;
		public Instructor(int id, String name, String surname, String citizenNumber, String email, String phoneNumber,
				String personelCode, String accountNumber) {
			super(id, name, surname, citizenNumber, email, phoneNumber);
			this.personelCode = personelCode;
			this.accountNumber = accountNumber;
		}
		public String getPersonelCode() {
			return personelCode;
		}
		public void setPersonelCode(String personelCode) {
			this.personelCode = personelCode;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
	
		
}
