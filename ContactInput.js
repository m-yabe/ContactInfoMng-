$('#submit').click(function() {
  agreeCheck();
  if($('#agreeCheck:visible').length == 1) {
    return false;
  }else {
  $('#form').submit();
}
//電話番号

//メールアドレス
var targets = document.getElementsByClassName('ico-required contact-form__required');
var targets=/^[A-Za-z0-9]{1}[A-Za-z0-9_.-+]*@{1}[A-Za-z0-9_.-]{1,}\.[A-Za-z0-9]{1,}$/;
  /* 入力された値がフォーマットに合うか */
      if(match(targets)){
          return true;
      }else{
          window.alert("メールアドレスの形式が正しくありません");
          window.alert("メールアドレスは半角英数字と記号（@.-_+）で入力してください");
          return false;
      }


//郵便番号
// point =document.getElementsById('post1');


});
$('[name="agree"]').change(function() {
  agreeCheck();
});
function agreeCheck() {
if(!$('[name="agree"]').is(':checked')) {
  $('#agreeCheck').fadeIn();
  $('#submit').attr('disabled', 'true');
} else {
  $('#agreeCheck').hide();
  $('#submit').removeAttr('disabled');
}
}
