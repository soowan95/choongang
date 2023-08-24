const menuA = ["실시간 방문자", "금일 방문자", "락커 관리", "회원 관리", "OT 일정", "PT 일정", "문의"]
window.onload = function() {
  for(i = 0; i < menuA.length; i++) {
    $("nav div:eq(" + i + ")").html(menuA[i]);
  }
  $("nav div").on("click", function() {
    let no = $(this).index();
    $("nav div").css("background", "white").css("color", "black");
    $(this).css("background", "black").css("color", "white");
    $(".msg").html(menuA[no]);
  })
}