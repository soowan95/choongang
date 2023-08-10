const bar0A = ["대학소개", "총장실", "대학현황"];
const bar1A = ["경영대학", "프라임", "온라인"];
const bar2A = ["학과대학", "학부", "칼리지"];
const bar3A = ["대학소개1", "총장실1", "대학현황1"];
const bar4A = ["대학소개2", "총장실2", "대학현황2"];
window.onload = function() {

}
let sw = 0;
$(function() {
  $(".at").hide();
  $(".at5").show();
  $(".guide p").on("click", function() {
    let no = $(this).index() + 1;
    $(".at").hide();
    $(".at" + no).show();
  })
  $(".gong p").on("click", function() {
    let no = $(this).index() + 6;
    $(".at").hide();
    $(".at" + no).show();
  })
  $(".bar").on("click", function() {
    if(sw == 1) {
      sw = 0;
      $(".rightSlide").animate({"left":"100%"},500);
      $(".barMenu").html("<i class='fa-solid fa-bars'></i>");
    } else {
      sw = 1;
      $(".rightSlide").animate({"left":"15%"},500);
      $(".barMenu").html("<i class='fa-solid fa-xmark'></i>");
    }
  })
  $(".rightSlide > li:eq(0) > p").on("click", function() {
    let no = $(this).index();
    if(no == 0) {
      for(i = 0; i < bar1A.length; i++) {
        $(".m" + i).html(bar0A[i]);
      }
    } else if(no == 1) {
      for(i = 0; i < bar2A.length; i++) {
        $(".m" + i).html(bar1A[i]);
      }
    } else if(no == 2){
      for(i = 0; i < bar2A.length; i++) {
        $(".m" + i).html(bar2A[i]);
      }
    } else if(no == 3){
      for(i = 0; i < bar3A.length; i++) {
        $(".m" + i).html(bar3A[i]);
      }
    } else {
      for(i = 0; i < bar4A.length; i++) {
        $(".m" + i).html(bar4A[i]);
      }
    }
  })
  $(".rightSlide > li:eq(1) > p").on("click", function() {
    $(".rightSlide").animate({"left":"100%"},500);
    $(".barMenu").html("<i class='fa-solid fa-bars'></i>");
    sw = 0;
  })
})