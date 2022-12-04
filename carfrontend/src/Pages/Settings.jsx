import React from 'react';
import "../styles/settings.css";

const Settings = () => {
  return (
     <div className='settings'>
       <div className='settings__wrapper'>
          <h2 className='settings__title'>Customer Details</h2>

          <div className='settings__top'>
             <button className='setting__btn'>My Details</button>
             <button className='setting__btn active__btn'>Profile</button>
             <button className='setting__btn'>Password</button>
             <button className='setting__btn'>Email</button>
             <button className='setting__btn'>Notification</button>
        </div>

         <div className='details__from'>
           <h2 className='profile__title'>Customer Profile</h2>
           <p className='profile__desc'>
               Update your photo and personal details here
           </p>

          <form>
             <div className='form__group'>
               <div>
                 <label>Your Id</label>
                 <input type ="text" placeholder='C001'/>
               </div>

             <div>
                <label>Your Name</label>
                <input type="text" placeholder='Jhon' />
             </div>
           </div>

             
             <div className='form__group'>
               <div>
                 <label>Your Address</label>
                 <input type="number" placeholder="401/A, Colombo" />
               </div>
             

             <div>
               <label>Your NIC</label>
               <input type="number" placeholder='88017*****V' />
              </div>
             </div>

             <div className='form__group'>
               <div>
                  <label>Your Email</label>
                  <input type="text" placeholder='sdsddsgs@ymail.com' />
               </div>

               <div>
                  <label>Your Number</label>
                  <input type="number" placeholder='+946848773' />
               </div>
             </div>


           
             <div className='form__group'>
               <div>
                  <label>Your Photo</label>
                  <p className='profile-img__desc'>
                     This will be displayed in your profile
                  </p>
                  <input type="file" placeholder='choose file' />
               </div>
             

           <div className='profile__img-btns'>
              <button className='dlt__btn'>Delete</button>
              <button className='save__btn'>Save</button>
           </div>

          </div>
          </form>

         </div>
     </div>
     </div>
  );
};

export default Settings;