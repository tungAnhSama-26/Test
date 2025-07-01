function playSong() {
    const song = document.getElementById("birthdaySong");
    song.play();
    alert("Happy Birthday to you! 🎉🎂");
    createConfetti();
}

function createConfetti() {
    const colors = ["#ff4d4d", "#ffcc00", "#66ff66", "#66ccff", "#ff99ff"];
    for(let i = 0; i < 100; i++) {
        const confetti = document.createElement("div");
        confetti.style.position = "fixed";
        confetti.style.left = Math.random() * 100 + "vw";
        confetti.style.top = "-20px";
        confetti.style.width = "10px";
        confetti.style.height = "10px"
        confetti.style.backgroundColor = colors[Math.floor(Math.random() * colors.length)];
        confetti.style.animation =  `fall ${Math.random() * 3 + 2}s linear forwards`;
        confetti.style.borderRadius = "50%"
        document.body.appendChild(confetti); 
    }
}

const style = document.createElement("style");
style.innerHTML =  document.head.appendChild(style);
  
