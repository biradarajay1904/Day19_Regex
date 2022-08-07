import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

public class Test {
	// use case 1 test cases for first name
	@Test
	// when the name starts with a capital letter
	public void givenFirstName_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("Ajay");
		Assert.assertEquals(true, result);
	}

	@Test
	// when a name starts with a small letter
	public void givenFirstName_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("ajay");
		Assert.assertEquals(false, result);
	}

	// when a name has 3 or more letters
	@Test
	public void givenFirstName_MinimumThreeLetters_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("Aj");
		Assert.assertEquals(true, result);
	}

	@Test
	// when a name does not contain 3 minimum letters
	public void givenFirstName_NotHaveMinimumThreeLetters_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("Ay");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateLastName("Biradar");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenLastNameNotStartsWithCapitalLetter_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateLastName("biradar");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenLastNameHaveMinimumThreeLetter_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateLastName("Bir");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenLastNameNotHaveMinimumThreeLetter_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateLastName("bi");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenEmailStartsWithSmallLetter_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateEmail("ajaybiradar64@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void getEmail_whenThreeDomain_shouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateEmail("Ajay@gmail.co.in.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenEmailEndsWithComOrIn_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateEmail("abc111@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void getEmail_whenEmailValid_shouldReturnTrue() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateEmail("Ajay@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePhone("91 9604445258");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenPhoneNumberIsNotFollowedByCountryCode_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePhone("8105215414");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPhoneNumber_WhenPhoneNumberIsTenDigit_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePhone("91 9604445258");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenPhoneNumberIsNotTenDigit_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePhone("91 8105215");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenPasswordIsMinimumEightDigit_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("Ajay234$");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenPasswordIsNotMinimumEightDigit_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("avin");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenPasswordHaveAtleastOneCapitalLetter_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("Ajay123@");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenPasswordNotHaveAtleastOneCapitalLetter_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("ajay@");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenPasswordHaveAtleastOneNumericNumber_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("Ajaybiradar2$");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenPasswordNotHaveAtleastOneNumericNumber_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("adased@");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenPasswordHaveAtleastOneSpeacialCharacter_ShouldReturn_True() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("Ajay234$");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenPasswordNotHaveAtleastOneSpeacialCharacter_ShouldReturn_False() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("ajay123");
		Assert.assertEquals(false, result);
	}

	// UseCase11-Parameterised Test to validate multiple entry for the Email
	// Address.
	@RunWith(Parameterized.class)
	public static class TestFormRegistration {
		String emailId;
		boolean expectedResult;
		private UserValidator emailVariable;
		UserValidator formObject = new UserValidator();

		public TestFormRegistration(String emailId, boolean expectedResult) {
			this.emailId = emailId;
			this.expectedResult = expectedResult;
		}

		@Before
		public void initialize() {
			emailVariable = new UserValidator();
		}

		@Parameterized.Parameters
		public static List<Object[]> emails() {
			return Arrays.asList(new Object[][] { { "Ajay@gmail.com", true }, { "Ajay@gmail.co.in", true },
					{ "ajaygmail.com", false } });
		}

		@Test
		public void testEmailId() {
			System.out.println("parameter email is->" + emailId);
			Assert.assertEquals(expectedResult, emailVariable.multipleEmailvalidate(emailId));
		}
	}
}