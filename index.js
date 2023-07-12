const message = {
name:"tapendra",
great :()=>{
setTimeout(()=>{
console.log('Hey' + this.name + ' , How are you ?')
},1000)
}
}
message.great;