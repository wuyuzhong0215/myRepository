function addMsg() {
    var param = $("#replytext").val();
    var infoId = $("#btn_addMsg").val();
    $.ajax({
        url:"insertReply.ajax",
        type:"post",
        data:{param:param,infoId:infoId},
        dataType:"json",
        success:function(list){
            var str = "";
            for(var i = 0;i<list.length;i++){
                var replytime = format(list[i].replytime);
                str += "<li>发表于："+replytime+"</li><li> " + list[i].content + " </li><br> ";
            }
            $(".replylist").html(str);
            $("#replytext").val("");
        }
    })
}

function changePage(dir){
    var arg = 0;
    var infoId = $("#btn_addMsg").val();
    if (dir){
        arg = 1;
    } else{
        arg = -1;
    }
    $.ajax({
        url:"changePage.ajax",
        type:"post",
        data:{arg:arg,infoId:infoId},
        dataType:"json",
        success:function (list) {
            var str = "";
            for(var i = 0;i<list.length;i++){
                var replytime = format(list[i].replytime);
                str += "<li>发表于："+replytime+"</li><li> " + list[i].content + " </li><br> ";
            }
            $(".replylist").html(str);
            $("#replytext").val("");
        }
    })
}

function add0(m){return m<10?'0'+m:m }
function format(shijianchuo)
{
//shijianchuo是整数，否则要parseInt转换
    var time = new Date(shijianchuo);
    var y = time.getFullYear();
    var m = time.getMonth()+1;
    var d = time.getDate();
    var h = time.getHours();
    var mm = time.getMinutes();
    var s = time.getSeconds();
    return y+'-'+add0(m)+'-'+add0(d)+' '+add0(h)+':'+add0(mm)+':'+add0(s);
}