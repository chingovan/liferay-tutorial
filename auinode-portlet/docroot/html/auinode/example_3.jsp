<%@include file="/html/auinode/init.jsp"%>


<aui:row>
	<aui:row>
		<input type="text" id="textColor" value=""/>
	</aui:row>
	<aui:row>
		<aui:col span="3">
			<input type="button" id="redButton" value="Red"/>
		</aui:col>
		<aui:col span="3">
			<input type="button" id="blueButton" value="Blue"/>
		</aui:col>
		<aui:col span="3">
			<input type="button" id="yellowButton" value="Yellow"/>
		</aui:col>
		<aui:col span="3">
			<input type="button" id="resetButton" value="Reset"/>
		</aui:col>
	</aui:row>
</aui:row>

<aui:script>
	AUI().use('aui-node', function(A){
		
		var text = A.one('#textColor');
		
		var redBtn = A.one('#redButton');
		var blueBtn = A.one('#blueButton');
		var yellowBtn = A.one('#yellowButton');
		var resetBtn = A.one('#resetButton');
		
		redBtn.on(
			'click', function(){
				
				text.removeClass('blue');
				text.removeClass('yellow');
				
				text.addClass('red');
			}
		);
		
		blueBtn.on(
				'click', function(){
					
					text.removeClass('red');
					text.removeClass('yellow');
					
					text.addClass('blue');
				}
			);
		
		yellowBtn.on(
				'click', function(){
					
					text.removeClass('blue');
					text.removeClass('red');
					
					text.addClass('yellow');
				}
			);
		
		resetBtn.on(
				'click', function(){
					
					text.removeClass('blue');
					text.removeClass('yellow');
					text.removeClass('red');
				}
			);
	});
</aui:script>