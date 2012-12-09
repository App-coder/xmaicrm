$.extend($.fn.validatebox.defaults.rules, {  
    minLength: {  
        validator: function(value, param){  
            return value.length >= param[0];  
        },  
        message: '输入的文字至少 {0}字符'  
    }  
}); 