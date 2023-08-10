/* ---------------js 시작------------- */
window.onload = function() {
  let soju1, soju2, soju3, info;
  soju1 = document.querySelector(".soju1");
  soju2 = document.querySelector(".soju2");
  soju3 = document.querySelector(".soju3");
  info = document.querySelector(".info");
  tap = document.querySelector(".tap");
  soju1.addEventListener("click", function() {
    info.innerHTML = "가장 대중적인 소주로 <strong>빨간뚜껑</strong>은 부담스럽습니다.";
    tap.style.display = "none";
  })
  soju2.addEventListener("click", function() {
    info.innerHTML = "참이슬과 양대산맥을 이루지만 뭐가 다른진 모르겠습니다.";
    tap.style.display = "none";
  })
  soju3.addEventListener("click", function() {
    info.innerHTML = "뭔가를 줄인 건강한 소주라지만 맛이 없습니다.";
    tap.style.display = "none";
  })
}
$(function() {
  let no;
  $(".pic input").on("click", function() {
    no = $(this).index();
    $(".btn").show();
    $(".tap div").hide();
  })
  $(".btn").on("click", function() {
    $(".tap").show();
    $(".tap div:eq(" + no + ")").show();
  })
})