package com.example.ContactInfoMng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactInfoMngController{

	@RequestMapping("/contact/inputForm")
	public String ContactInput() {
		// お問い合わせフォームを表示
		return "ContactInput";
	}
	@RequestMapping("/contact/list")
	public String ContactList() {
		// お問い合わせ一覧を表示
		return "ContactList";
	}
	//確認用 いずれGET送信
	@RequestMapping("/contact/confirmation")
	public String ContactConf() {
		// 登録画面を表示
		return "ContactConf";
	}
}
