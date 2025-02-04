package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotEmpty(message = "氏名を入力してください")
	@Size(max = 100, message = "氏名は100文字以下で入力してください")
	private String name;
	/** メールアドレス */
	@NotEmpty(message = "メールアドレスを入力してください")
    @Size(max = 100, message = "メールアドレスは100文字以下で入力してください")
    @Email(message = "メールアドレスの形式が不正です")
	
	private String mailAddress;
	/** パスワード */
	@NotEmpty(message = "パスワードを入力してください")
	@Size(min = 8, max = 20, message = "パスワードは8文字以上、20文字以下で入力してください")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,20}$", message = "英大文字、小文字、数字をそれぞれ少なくとも1文字は使用してください")
    private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}
