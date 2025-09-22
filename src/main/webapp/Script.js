// Pop Up Section
let popupItem =document.querySelector(".Popup-item")
let popupOverlay =document.querySelector(".Popup-Overlay")
let btn1 =document.getElementById("AddPopup")


btn1.addEventListener("click",()=>{
    popupOverlay.style.display = "block";
    popupItem.style.display ="block";
})

let btn2 = document.getElementById("cancel")
btn2.addEventListener("click",(event)=>{
    event.preventDefault();
    popupOverlay.style.display = "none";
    popupItem.style.display ="none";
})

// Book Input Add and Display Section
let bookContainer = document.querySelector(".Container")
let addbook =document.getElementById("Add")
let bookTitle = document.querySelector("#BookTitle")
let bookOwner = document.querySelector("#BookOwner")
let bookDescription = document.querySelector("#BookDescription")

addbook.addEventListener("click",(event)=>{
    event.preventDefault();
   var div = document.createElement("div");
   div.setAttribute("class","book-Container")
   div.innerHTML =` <h2>${bookTitle.value}</h2>
   <h5>${bookOwner.value}</h5>
   <p>${bookDescription.value}</p>
    <button onclick="Deleteone(event)">Delete</button>
 `
   bookContainer.append(div)
    popupOverlay.style.display = "none";
    popupItem.style.display ="none";
})
// Delete one
function Deleteone(event){
    event.target.parentElement.remove();
}