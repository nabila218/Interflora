<script>
  var harga;
  var nama_barang;
  var ket ="";
  var total=0;
  
  function cek_barang(){
    var nama = document.getElementById("listbarang").value;
    switch (nama) {
       case'Buku':
          harga = 10000;
          nama_barang = "Buku";
          break;
      case'Tas':
          harga = 50000;
          nama_barang = "Tas";
          break;
      case'Pensil':
          harga = 5000;
          nama_barang = "Pensil";
          break;
      case'Penghapus':
          harga = 15000;;
          nama_barang = "Penghapus";
          break;
    }
    
  }
</script>