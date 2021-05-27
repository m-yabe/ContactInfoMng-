 $(function() {
    $('#submit').click(function() {
      agreeCheck();
      if($('#agreeCheck:visible').length == 1) {
        //送信しないように終わらせる
        return false;
      }
      //入力チェックを条件を始める
      
    });
    $('[name="agree"]').change(function() {
      agreeCheck();
    });
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
  //送信の場合は$('#form').submit();をする