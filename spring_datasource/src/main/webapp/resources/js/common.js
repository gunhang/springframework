//팝업창들 뛰우기
//새로운 Window창을 Open할 경우 사용되는 함수 ( arg : 주소 , 창타이틀 , 넓이 , 길이 )
function OpenWindow(UrlStr, WinTitle, WinWidth, WinHeight) {
   winleft = (screen.width - WinWidth) / 2;
   wintop = (screen.height - WinHeight) / 2;
   var win = window.open(UrlStr , WinTitle , "scrollbars=yes,width="+ WinWidth +", " 
                     +"height="+ WinHeight +", top="+ wintop +", left=" 
                     + winleft +", resizable=yes, status=yes"  );
   win.focus() ; 
}


//팝업창 닫기
function CloseWindow(){
   
   window.opener.location.reload(true);      
   window.close();
}


//사용자 사진 출력
function MemberPictureThumb(contextPath){ //(대상, 사용자아아디)
   for(var target of document.querySelectorAll('.manPicture')){
      var id = target.getAttribute('data-id');
      
      target.style.backgroundImage="url('"+contextPath+"/member/getPicture.do?id="+id+"')";
      target.style.backgroundPosition="center";
      target.style.backgroundRepeat="no-repeat";
      target.style.backgroundSize="cover";
   }
}

// summernote
var contextPath = "";
function summernote_go(target,context){
   contextPath = context;
   
   
 target.summernote({
         height: 300,                 // 에디터 높이
         lang: "ko-KR",               // 한글 설정
         placeholder: '최대 2048자까지 쓸 수 있습니다',   //placeholder 설정
         disableResizeEditor : true,
         callbacks:{
            onImageUpload : function(files, editor, welEditable) {
               for(var file of files){
                  //alert(file.name);
                  if(file.name.substring(file.name.lastIndexOf(".")+1).toUpperCase() != "JPG"){
                     alert("jpg만")
                     return;
                  }
                  if(file.size > 1024*1024*5){
                     alert("5메가 미만만");
                     return;
                  }
               }
               for(var file of files){
                  sendFile(file,this);
               }
            },
            onMediaDelete:function(target){
               // alert("img delete");
               // alert(target[0].src);
               // alert(target.attr("src"));
               deleteFile(target[0].src);
            }
         }
     });

      function sendFile(file,el){
          var form_data = new FormData();
          form_data.append("file",file);
          $.ajax({
             url:contextPath+'/uploadImg.do',
             data : form_data,
             type : "POST",
             contentType : false,
             processData : false,
             success : function(img_url) {
                $(el).summernote('editor.insertImage' , img_url);
             },
             error : function(){
                alert(file.name+"업로드에 실패했습니다.");
             }
          });
       } // sendFile() end
       
       function deleteFile(src){
          var splitSrc = src.split("=");
          var fileName = splitSrc[splitSrc.length-1];
          
          var fileDate = {fileName:fileName}; // literal 방식
          
          $.ajax({
             url:contextPath+"/deleteImg.do",
             data:JSON.stringify(fileData), // json데이터를 String으로 변환해서 body에 심어서 보내줌
             // json데이터로는 파일 못보냄. 이런 경우는 form으로 보내야함
             type:"post",
             contentType:"application/json",
             success:function(res){
                console.log(res);
             },
             error:function(){
                alert("이미지 삭제가 불가합니다.");
             }
          });
       } // deleteFile() end

}
















