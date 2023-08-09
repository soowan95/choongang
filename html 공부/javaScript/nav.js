/* javaScript */
window.onload = function() {
  
}
$(function() {
  $(".btn").on("click", function() {
  let i = 0, j = 0;
  while(i < 9) {
    i++;
    while(j < 9) {
    j++;
    console.log(i + "x" + j + "=" + i * j);
    }
    j = 0;
  }
  })
})