var mShowBanner = new Array(); mShowBanner['1']='显示'; mShowBanner['0']='隐藏'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionFormShowBanner(selectValue){ writeSelectAllOptionFormShowBanner_(selectValue,'所有', false); } function writeSelectAllOptionFormShowBanner_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in mShowBanner){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+mShowBanner[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+mShowBanner[p]+'</option>'; } } document.write('<select name=mShowBanner '+(required? 'required':'')+' lay-verify="mShowBanner" lay-filter="mShowBanner" id="mShowBanner">'+content+'</select>'); } var xnx3_r1550693115 = '1111111111111111111111111111111111111111111';