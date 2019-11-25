package com.example.myapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class CartAdapter extends FirestoreRecyclerAdapter<Cart, CartAdapter.CartHolder> {

    public CartAdapter(@NonNull FirestoreRecyclerOptions<Cart> options) {
        super(options);
    }

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    FirebaseAuth mFirebaseAuth;
    String TAG = "CartAdapter";
    Spinner spinner;
    @Override
    protected void onBindViewHolder(@NonNull CartHolder cartHolder, int i, @NonNull Cart cart) {

        cartHolder.tvCartStatus.setText(cart.getStatus());
        cartHolder.tvCartId.setText(String.valueOf(cart.getId()));
    }

    @NonNull
    @Override
    public CartHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart,parent, false);
        return new CartHolder(v);
    }

    class CartHolder extends RecyclerView.ViewHolder{
        TextView tvCartId;
        TextView tvCartStatus;



        public CartHolder(@NonNull View itemView) {
            super(itemView);

            tvCartId = itemView.findViewById(R.id.CartID);
            tvCartStatus = itemView.findViewById(R.id.tvStatus);
            spinner = itemView.findViewById(R.id.Status_drop);
        }


    }

//    public void UpdateStatus{
//
//    String value = spinner.getSelectedItem().toString();
//        DocumentReference CartRef = db.collection("Golf Carts").document(mFirebaseAuth.getUid());
//        CartRef.update("Status", value).addOnSuccessListener(new OnSuccessListener<Void>() {
//            @Override
//            public void onSuccess(Void aVoid) {
//                Log.d(TAG, "DocumentSnapshot successfully updated!");
//            }
//        })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        Log.w(TAG, "Error updating", e);
//                    }
//                });
//   }
}
