var isshow = new Array(); isshow['1']='显示'; isshow['2']='隐藏'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForisshow(selectValue){ writeSelectAllOptionForisshow_(selectValue,'所有', false); } function writeSelectAllOptionForisshow_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in isshow){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+isshow[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+isshow[p]+'</option>'; } } document.write('<select name=isshow '+(required? 'required':'')+' lay-verify="isshow" lay-filter="isshow" id="isshow">'+content+'</select>'); } var xnx3_r1550661212 = '11111111111111111111111111111111111111111111111111';