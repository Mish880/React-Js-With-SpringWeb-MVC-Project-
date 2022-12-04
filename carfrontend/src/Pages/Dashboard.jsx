import React from 'react';
import "../styles/dashboard.css"


const Dashboard = () => {
  return (
     <div className='main'>
        <div className='content'>
         <h1>Auto Motive & <br/><span>Rental with</span> <br/>Car</h1>
         <p className='par'>Lorem ipsum dolor sit amet consectetur adipisicing elit.<br/>
          Deserunt dolorum, modi earum, sit mollitia corporis optio maxime quaerat esse facere
          <br/>veritatis sint harum non quo? Unde impedit id itaque commodi!</p>

          <button className='cn'><a href="#">Signup</a></button>  
        </div>
     </div>
  );
};

export default Dashboard;