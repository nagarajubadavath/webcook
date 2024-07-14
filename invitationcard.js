function perform()
{
    selected=document.getElementById("selected").value;
    document.getElementById("InvitationContainer").innerHTML='';
    const newDiv=document.createElement('div');

    if(selected==='WeddingInvitation'){
    newDiv.style.border="2px solid black";
    newDiv.style.height="600px";
    newDiv.style.width="800px";
    newDiv.className="wedding"
    newDiv.innerHTML=`
    <div class='weds'>
    <h6>4TH FEBRUARY</h6>
    <h2>Handsome<p>&#128145;</p>Gorgeous</h2>
    </div>
    <div class='p1'>
    <p><b>We are getting married on February 4th</b></p>
    </div>
    <div class='p2'>
    <p>And we'd love for you to join on this special Day.<br>See you at maldives,at 11am.</p>
    </div>
    <div class='rspv'>
    <p>Please RSPV before 25th march.</p>
    <div>
    <p><button class='btn'>RSPV</button></p>
    </div>
    </div>
    </div>
    `
    }
    else if(selected==="BirthDayInvitation"){
        newDiv.style.border='2px solid black';
        newDiv.style.height='400px';
        newDiv.style.width='600px';
        newDiv.className="birthday"
        newDiv.innerHTML=`
        <div class='b1'>
        <h2 class='b1'><b>It's Nagaraju's 21st Birthday</b><br><b>Join us at</b> 11am <b>on</b> May 15th <b>to celebrate</b>.</h2>
        </div>
        <hr class=dashed>
        <div class='b2'>
        <h2>The party will be held at:<br>Rgukt Campus -Basar</div>
        <div class='b3'><p><button class='sbtn'>Count Me!</button></p><div>
        `
    }
    if(selected!='choose'){
        InvitationContainer.appendChild(newDiv);
    }

}