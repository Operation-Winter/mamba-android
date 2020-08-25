package za.co.armandkamffer.mamba

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.landing_item.view.*

class LandingAdapter(private val landingItems: Array<LandingItem>) :
    RecyclerView.Adapter<LandingAdapter.LandingViewHolder>() {

    class LandingViewHolder(val landingRow: LinearLayout) : RecyclerView.ViewHolder(landingRow)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandingAdapter.LandingViewHolder {
        val landingRow = LayoutInflater.from(parent.context).inflate(
            R.layout.landing_item,
            parent,
            false
        ) as LinearLayout
        return LandingViewHolder(landingRow)
    }

    override fun onBindViewHolder(holder: LandingViewHolder, position: Int) {
        val startTime = System.currentTimeMillis()

        holder.landingRow.textView.setText(landingItems[position].titleRes)
        holder.landingRow.imageView.setImageResource(landingItems[position].imageRes)

        Log.i(TAG, "bindView time: " + (System.currentTimeMillis() - startTime))
    }

    override fun getItemCount() = landingItems.size
}