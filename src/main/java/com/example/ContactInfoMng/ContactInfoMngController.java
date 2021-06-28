package com.example.ContactInfoMng;




import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ContactInfoMng.Entity.Contact;
import com.example.ContactInfoMng.Repository.ContactRepository;

@Controller
public class ContactInfoMngController{
	//インターフェースrepositoryのオブジェクト化
	@Autowired
	private ContactRepository contactRepository;
	@RequestMapping("/contact/inputForm")
	public String ContactInput(){
		//お問い合わせフォームを表示
		return "ContactInput";
		
	}
	
	
	//DB登録処理
	@PostMapping(path="/contact/confirmation")
	//             メソッド名             HTMLのパラメーター
	  public String contactInputSubmit(@RequestParam String contact_cd
			  						  ,@RequestParam String company
			  						  ,@RequestParam String register1
			  						  ,@RequestParam String register2
			  						  ,@RequestParam String tel1
			  						  ,@RequestParam String tel2
			  						  ,@RequestParam String tel3
			  						  ,@RequestParam String mail
			  						  ,@RequestParam String post1
			  						  ,@RequestParam String post2
			  						  ,@RequestParam String street_address
			  						  ,@RequestParam String contents
			  						  ,Model model
			  							){
		
		Contact contactAddData= new Contact();
			//インスタンス化したものを()内のものでセットする
		contactAddData.setAll(contact_cd
				 			,company
				 			,register1
				 			,register2
				 			,tel1
				 			,tel2
				 			,tel3
				 			,mail
				 			,post1
				 			,post2
				 			,street_address
				 			,contents
				 			);
		
		//インターフェースからsave(継承)でＤＢのコードをしている
		Date date =new Date();
		//更新日時フォーマトを定義
		DateFormat dateFormat = new SimpleDateFormat("YYYY/MM/DD hh:mm");
        contactAddData.setupdate_DATE( dateFormat.format(date));
        contactAddData.setcreate_DATE( dateFormat.format(date));
		//更新者、作成者を入力
		contactAddData.setcreate_USER("springuser");
		contactAddData.setupdate_USER("springuser");
		
		//登録遷移する際の例外処理
		boolean eror= false;
		try {
			contactRepository.save(contactAddData);
		}catch(Exception e){
			eror=true;
			model.addAttribute("eror",eror);
			//お問い合わせフォームに返す
			return "ContactInput";
		}
		//継承
		contactRepository.save(contactAddData);
		//登録確認画面に返す
	    return "ContactConf";
	}
	
	@RequestMapping("/contact/list")
	public String ContactList(){
		//お問い合わせ一覧を表示
		return "ContactList";
	}
//	@GetMapping(path ="/contact/List")
//	public String Contact(Model model){
//		Interable<Contact> tcontactList =ContactRepository.getAll();
//		model.addAttribute("tcontactlist",tcontactList);
//		return "ContactList";
//	}
}
