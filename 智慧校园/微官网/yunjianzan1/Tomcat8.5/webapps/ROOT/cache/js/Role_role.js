var role = new Array(); role['1']='建站用户'; role['2']='论坛用户'; role['9']='总管理'; role['10']='代理';  /* 将 2,3,4 的权限字段转换为会员,超级管理员显示在html */ function writeName(authority){var roleArray=authority.split(',');var s='';for(var i=0;i<roleArray.length;i++){if(s!=''){s=s+','}s=s+role[roleArray[i]]}document.write(s)} /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForrole(selectValue){ writeSelectAllOptionForrole_(selectValue,'所有', false); } function writeSelectAllOptionForrole_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in role){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+role[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+role[p]+'</option>'; } } document.write('<select name=role '+(required? 'required':'')+' lay-verify="role" lay-filter="role" id="role">'+content+'</select>'); } var xnx3_r1550905442 = '111111111111';