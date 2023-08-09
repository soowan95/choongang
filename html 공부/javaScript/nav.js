/* javaScript */
window.onload = function() {

}
$(function() {
  $(".btn").on("click", function() {
  // ---------------구구단
  let i = 0, j = 0;
  while(i < 9) {
    i++;
    while(j < 9) {
    j++;
    console.log(i + "x" + j + "=" + i * j);
    }
    j = 0;
  }
  // ------------짝수만 더하기
  let k = sum = 0;
  while(k < 50) {
    k++;
    sum += k * 2;
  }
  console.log(sum);
  })  
})